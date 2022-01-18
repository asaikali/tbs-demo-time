# tbs-demo-time

Demo showing how to use Tanzu Build Service + GitHub Actions to automatically containerize applications

# creating an image using kp 

## From git repo

`kp image create tbs-demo-time-git-repo --tag tapdemo.azurecr.io/tbs-demo-time --git https://github.com/asaikali/tbs-demo-time.git --git-revision main`

You can also use `kubectl apply -f tbs/image-from-git.yaml` to do the same as the kp cli 


