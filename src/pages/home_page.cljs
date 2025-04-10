(ns pages.home-page
  (:require ["@chakra-ui/react" :refer [Flex]]))

(defn HomePage []
  #jsx [Flex {:width "100%" :height "100vh" :justifyContent "center" :bgColor "antiquewhite"}
        [Flex {:flexDirection "column" :width "100%" :maxWidth "1000px" :bgColor "white"}
         "Home Page"]])
