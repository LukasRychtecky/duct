(defproject duct/generators "0.0.3-SNAPSHOT"
  :description "Duct generators for lein-generate"
  :url "https://github.com/weavejester/duct"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :eval-in-leiningen true
  :dependencies [[lein-gen "0.2.0"]
                 [rewrite-clj "0.3.9"]]
  :profiles {:dev {:plugins [[lein-gen "0.2.0"]]
                   :duct {:ns-prefix example}}})
