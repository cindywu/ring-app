(ns ring-app.core
  (:require [ring.adapter.jetty :as jetty]))

(defn handler [request-map]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body (str "<html><body> your IP is: "
              (:remote-addr request-map)
              "</body></html>")})

(defn -main []
  (jetty/run-jetty
    handler
    {:port 3000
     :join? false}))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
