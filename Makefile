build-all: build-html build-pdf build-pptx create-index

build-html:
	rm -rf dist/ && marp -I . && cp -r images dist/ 

build-pdf:
	marp --pdf -I .

build-pptx:
	marp --pptx -I .

dev:
	mkdir -p dist &&\
	rm -f $(PWD)/images/images &&\
  ln -s $(PWD)/images $(PWD)/dist/images &&\
  marp --watch -I .

create-index: 
	cd dist && sh -c 'tree \
    -H "." \
    -L 1 \
    --noreport \
    -I "index.html" \
    -T "EDDYA" \
    --ignore-case \
    --timefmt "%d-%b-%Y %H:%M" \
    -s \
    -D \
		-I "images" \
    -o "./index.html"' {} \;
