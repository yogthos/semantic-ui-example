(ns semantic-ui-example.prod
  (:require
    [semantic-ui-example.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
