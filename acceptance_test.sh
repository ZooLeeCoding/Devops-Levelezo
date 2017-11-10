#!/bin/bash
echo $(curl localhost:8675/sum?a=1\&b=2)
test $(curl localhost:8675/sum?a=1\&b=2) -eq 3
