(ns pages.home-page
  (:require ["@chakra-ui/react" :refer [Flex Link Heading]]
            ["wouter" :as wouter]))

(defn HomePage []
  #jsx [Flex {:width "100%" :height "100vh" :justifyContent "center" :bgColor "antiquewhite"}
        [Flex {:flexDirection "column" :width "100%" :maxWidth "1000px" :bgColor "white"}
         [Heading {:as "h1" :size "2xl"} "Home Page"]
         [Link {:asChild true}
          [wouter/Link {:href "/about"} "About"]]]])
