(defproject glingo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [http-kit "2.1.18"]
                 [org.clojure/data.json "0.2.6"]
                 [environ "0.5.0"]
                 ]
  :profiles {:dev   {:dependencies
                     [[midje "1.6.3"]
                      [midje-junit-formatter "0.1.0-SNAPSHOT"]]
                     :plugins [[lein-environ "1.0.0"]]
                     }})
