.PHONY: help

help: ## This help.
	@awk 'BEGIN {FS = ":.*?## "} /^[a-zA-Z_-]+:.*?## / {printf "\033[36m%-30s\033[0m %s\n", $$1, $$2}' $(MAKEFILE_LIST)

.DEFAULT_GOAL := help

install:

start-presentation:			## Start presentation
	@## See: https://github.com/webpro/reveal-md
	@echo "Presentation available at http://localhost:1948/slides.md"
	@docker run --rm --name reveal-md -p 1948:1948 -p 35729:35729 -v $(shell pwd):/slides webpronl/reveal-md:latest /slides --theme white --css style.css

develop-presentation:			## Develop presentation
	@## See: https://github.com/webpro/reveal-md
	@echo "Presentation available at http://localhost:1948/slides.md"
	@docker run --rm --name reveal-md -p 1948:1948 -p 35729:35729 -v $(shell pwd):/slides webpronl/reveal-md:latest /slides --watch --theme white --css style.css


