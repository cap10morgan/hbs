(ns hbs.core-test
  (:use clojure.test
        hbs.core))

(deftest test-render
  (testing "test inline render"
    (is (= "Hello World" (render "Hello {{name}}" {:name "World"})))))

(deftest test-render-file
  (testing "test render from file"
    (is (= "Hello World!\n" (render-file "hello" {:name "World"})))))

