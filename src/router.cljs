(ns router
  (:require ["wouter" :refer [Route Switch]]
            [pages.home-page :refer [HomePage]]))

(defn Router []
  #jsx [Switch
        [Route {:path "/" :component HomePage}]])
