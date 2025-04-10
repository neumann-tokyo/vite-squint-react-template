(ns pages.about-page
  (:require ["@chakra-ui/react" :refer [Flex]]))

(defn AboutPage []
  #jsx [Flex {:width "100%" :height "100vh" :justifyContent "center" :bgColor "antiquewhite"}
        [Flex {:flexDirection "column" :width "100%" :maxWidth "1000px" :bgColor "white"}
         "About Page"]])
