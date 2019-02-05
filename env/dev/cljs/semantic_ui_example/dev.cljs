(ns ^:figwheel-no-load semantic-ui-example.dev
  (:require
    [semantic-ui-example.core :as core]
    [devtools.core :as devtools]))


(enable-console-print!)

(devtools/install!)

(core/init!)
