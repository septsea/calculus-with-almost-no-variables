# Calculus with almost no variables

Written in `LaTeX`, this is a book discussing how to play calculus with almost no variables.

这是一本用 `LaTeX` 写的讨论如何几乎无变量地玩微积分的书。

Well, the book is in Chinese. Readers are assumed to be familiar with elementary calculus.

嘛，本书用汉语写的。作者假定读者有初步的微积分知识。

Direct Links for the PDF File:

- [https://gitee.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf](https://gitee.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf)
- [https://github.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf](https://github.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf)

可携带文档格式文件的直链如下：

- [https://gitee.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf](https://gitee.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf)
- [https://github.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf](https://github.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf)

Enter one of the links to download the book.

进入一个链接以下载本书。

The following tells you how to compile the source code. If you just want to read it, ignore it safely.

下面告诉您怎么编译源代码。如果您只是想读这本书，您放心地忽略它吧！

---

To compile the `tex` files, try one of the following:

- Execute `make`.
- Execute `latexmk -pdflatex="xelatex -shell-escape -file-line-error -halt-on-error -interaction=nonstopmode -synctex=1 %O %S" -pdf main.tex` if you do not have `make` installed or you prefer not to use `make`.
- Execute `xelatex -shell-escape -file-line-error -halt-on-error -interaction=nonstopmode -synctex=1 main.tex` if you prefer not to use `latexmk`.
- Open the folder which contains `main.tex` with Visual Studio Code (make sure that the extension `LaTeX Workshop` by *James Yu* is installed.)
- If you think that Visual Studio Code sucks, just use whatever text editor you like. By the way, I do think that Visual Studio Code still needs improving.
- Whatever method you like is fine. Just remember to compile them with `XeLaTeX`.
- Well, I give up providing more suggestions. As long as you can compile it successfully, do whatever you like!

The external fonts that I use are `Source Han Serif CN` and `Sarasa Mono SC`. You might want to install them or modify the font settings in `main.tex` first.

Please feel free to read, modify or redistribute the book, where the *or* is of course an inclusive *or*.

I highly appreciate any comments, corrections or suggestions.

Project Links:

- [https://gitee.com/septsea/calculus-with-almost-no-variables](https://gitee.com/septsea/calculus-with-almost-no-variables)
- [https://github.com/septsea/calculus-with-almost-no-variables](https://github.com/septsea/calculus-with-almost-no-variables)
