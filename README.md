1) docker build -t lakshithah/istio-demo:latest .

2) docker run -d -p 8080:8080 -e UPSTREAM_URI=middleware -e SERVICE_NAME=pistashio lakshithah/istio-demo:v1
