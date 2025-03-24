(ns index
  (:require [my-component :refer [MyComponent]]
            ["react" :as react]
            ["react-dom/client" :refer [createRoot]]))

(def root (createRoot (js/document.getElementById "app")))
(.render root #jsx [react/StrictMode [MyComponent]])
