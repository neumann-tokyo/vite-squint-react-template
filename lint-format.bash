#!/bin/bash

if [ -z $(which joker) ]; then
    echo "Joker is not installed. Please install it. https://github.com/candid82/joker"
    exit 1
fi

# RUN LINT
joker --lint --working-dir .

# RUN FORMAT
target_files=$(git ls-files | grep -E '\.(cljs|clj|edn)$')

for file in $target_files; do
    joker --format $file > /tmp/joker-format
    cat /tmp/joker-format > $file
done

exit 0
