(defproject hello "0.1.0-SNAPSHOT"
  :description "A useless Clojure library usable from Java."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.5.0"]]
  
  :source-paths ["src/clojure"]
  :test-paths ["test/clojure"]
  :java-source-paths ["src/java"]
  :javac-options ["-target" "1.6" "-source" "1.6"]
  :aot :all
  :omit-source true)
