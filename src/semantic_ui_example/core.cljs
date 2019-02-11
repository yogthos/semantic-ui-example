(ns semantic-ui-example.core
    (:require
      [reagent.core :as r]
      [cljsjs.semantic-ui-react :as ui]))

(defn date-picker []
  (r/with-let [date (r/atom nil)]
    [:> js/DateInput
     {:name "date"
      :placeholder ""
      :value @date
      :onChange (fn [event v]
                  (reset! date (.-value v)))}]))

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
      [date-picker]]]])

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
