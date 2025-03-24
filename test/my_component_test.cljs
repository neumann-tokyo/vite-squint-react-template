(ns my-component-test
  (:require [my-lib :refer [adder]]
            ["vitest" :refer [expect test]]))

(test "my-component adder works"
      (fn []
        (-> (expect (adder 1 2 3))
            (.toBe 6))))
