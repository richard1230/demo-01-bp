#!/bin/zsh

git add . &&
git commit -m "$1" &&
git pull &&
git push -u origin main