(defproject ring-example "0.1.0-SNAPSHOT"
  :description "Reitit Http App with Swagger"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [ring/ring-jetty-adapter "1.7.1"]
                 [aleph "0.4.7-alpha5"]
                 [fi.metosin/reitit "0.7.0-alpha6"]
                 [metosin/ring-swagger-ui "5.0.0-alpha.0"]]
  :repl-options {:init-ns example.server})
