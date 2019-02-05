(ns semantic-ui-example.core
    (:require
      [reagent.core :as r]
      [cljsjs.semantic-ui-react :as ui]))

(defn home-page []
  [:> ui/Grid
   {:centered true
    :columns 3
    :divided true}
   [:> ui/Grid.Row
     [:> ui/Grid.Column
      [:> ui/Input {:placeholder "some input"}]]
     [:> ui/Grid.Column
      [:p "column 2"]]
      [:> ui/Grid.Column
        [:p "column 3"]]]])

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
