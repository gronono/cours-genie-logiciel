#!/bin/bash

# Inspired by https://www.savaslabs.com/blog/deploying-jekyll-github-pages-travis-and-gulp

set -e

# Build new site
cd cours
gem update --system
gem install bundler
bundle install
JEKYLL_ENV=production bundle exec jekyll build

# Delete previous pages
git clone https://${GITHUB_TOKEN}@github.com/gronono/cours-genie-logiciel.git gh-pages
cd gh-pages
git checkout gh-pages
rm -rf *

# Copie new site
cp -R ../_site/* .

# Push new pages
git config user.email "gronono@users.noreply.github.com"
git config user.name "Travis Publisher"
git status
git add -A .
git commit -a -m "Travis #${TRAVIS_BUILD_NUMBER}"
git push --quiet origin gh-pages
