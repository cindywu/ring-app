(defproject ring-app "0.1.0-SNAPSHOT"
  :description "Ring App"
  :url "https://github.com/cindywu/ring-app"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring "1.4.0"]
                 [metosin/ring-http-response "0.6.5"]
                 [ring-middleware-format "0.7.0"]
                 [compojure "1.4.0"]]
  :repl-options {:init-ns ring-app.core}
  :main ring-app.core)
