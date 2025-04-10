(ns index
  (:require [app :refer [App]]
            ["react-dom/client" :refer [createRoot]]))

(def root (createRoot (js/document.getElementById "app")))

(.render root #jsx [App])
