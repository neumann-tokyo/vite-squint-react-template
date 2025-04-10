(ns app
  (:require ["react" :as react]
            ["@chakra-ui/react" :refer [ChakraProvider defaultSystem]]
            [router :refer [Router]]))

(defn App []
  #jsx [react/StrictMode
        [ChakraProvider {:value defaultSystem}
         [Router]]])
