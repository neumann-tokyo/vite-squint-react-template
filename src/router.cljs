(ns router
  (:require ["wouter" :refer [Route Switch]]
            [pages.home-page :refer [HomePage]]
            [pages.about-page :refer [AboutPage]]))

(defn Router []
  #jsx [Switch
        [Route {:path "/" :component HomePage}]
        [Route {:path "/about" :component AboutPage}]])
