# Calculus with almost no variables

**本书已死.**
**有心无力.**

---

## 术语表

|                |                               |
| -------------: | :---------------------------- |
|           土话 | Chinese                       |
|           胡话 | English                       |
|           乳胶 | `LaTeX`                       |
|           算学 | mathematics                   |
|         算学的 | mathematical                  |
|         算学家 | mathematician                 |
| 可携带文档格式 | Portable Document Format; PDF |
| 视觉工作室代码 | Visual Studio Code            |
|             窗 | Windows                       |


## 致想读我的书的读者

您好!

可携带文档格式文件的直链如下:
- [https://gitee.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf](https://gitee.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf)
(需上码云号)
- [https://github.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf](https://github.com/septsea/calculus-with-almost-no-variables/raw/main/main.pdf)
(无需上任何号, 但您不一定能马上进去)

进入一个链接以下载本书.

这是一本用乳胶写的讨论如何几乎无变量地玩微积分的书.

具体地, 本书讨论如何几乎无变量地计算导数与不定积分与积分.

本书用土话写的.
我假定您有初步的微积分知识.

本书**不实用**;
本书**不是算学的革命**;
本书**从未想过推翻现有的体系**.

您喜欢它,
那就帮我宣传宣传;
您不喜欢它,
您可以拉黑本书,
也可拉黑我,
也可不干任何事.

## 致想进一步了解我的书 (或其实现) 的读者

您好!

我置本书的源代码于:

- [https://gitee.com/septsea/calculus-with-almost-no-variables](https://gitee.com/septsea/calculus-with-almost-no-variables)
- [https://github.com/septsea/calculus-with-almost-no-variables](https://github.com/septsea/calculus-with-almost-no-variables)

假如您想了解我如何作出本书,
您可读本书的附录 D;
我用乳胶论乳胶.
目前, 我还在写它;
这可不像算学的内容那么好写呀.
我的乳胶只是有限的经验罢了,
无任何系统理论.
这应该算是实用的乳胶罢.

**获取方法 0:** (推荐)

打开命令行.
执行下列四句话的任意一句.
假如您失败了, 您可多试几次, 或换一句话.

```bash
git clone https://gitee.com/septsea/calculus-with-almost-no-variables.git
```

```bash
git clone git@gitee.com:septsea/calculus-with-almost-no-variables.git
```

```bash
git clone https://github.com/septsea/calculus-with-almost-no-variables.git
```

```bash
git clone git@github.com:septsea/calculus-with-almost-no-variables.git
```

假如您不知道 `git clone` 的作用, 请自行了解之.
不管是百度还是谷歌还是必应还是其他都比我强.

**获取方法 1:** (较不推荐)

您打开

- [https://gitee.com/septsea/calculus-with-almost-no-variables](https://gitee.com/septsea/calculus-with-almost-no-variables)
- [https://github.com/septsea/calculus-with-almost-no-variables](https://github.com/septsea/calculus-with-almost-no-variables)

的任意一个, 然后下载所有的文件为一个压缩文件即可.

具体地, 要么点
```
克隆/下载 ---> 下载ZIP
```
要么点
```
Code ---> Download ZIP
```
这里的 `--->` 表示 "然后".

有了书的代码, 您可能想试编译本书.
我有很多方法 (但本质只有一个) 使您编译之.

我假定您可正常地使用乳胶.

当我说 ``执行'' 时, 请您打开一个命令行,
并进入 `README.md` 所在的目录.

- 执行 `make` .
当然了, 假如您无法执行它, 就换下一个方法.
- 执行 `latexmk -xelatex -shell-escape -file-line-error -norc -synctex=1 -interaction=nonstopmode -silent main` .
- 用视觉工作室代码打开含 `README.md` 的目录.
具体地, 在视工代里,
按一下 `F1` 或 `Ctrl+Shift+p` 或 `Command+Shift+p` ,
输入 `File: Open Folder` ,
再点一下含 "File: Open Folder..." 的项.
然后, 找到含 `README.md` 的目录, 打开之.
假如您装了 James Yu 的 LaTeX Workshop,
那您就可以方便地编译本书.
假如您没有装它, 那为什么不装一个呢?
- 假如您不喜欢我给出的办法,
那您当然也可用自己喜欢的办法;
您编出来就行.
我只提一个建议: 用 XeLaTeX.

我用到了如下的字体:
- [Source Han Serif CN](https://mirrors.tuna.tsinghua.edu.cn/adobe-fonts/source-han-serif/SubsetOTF/CN/)
- [Sarasa Mono SC](https://mirrors.tuna.tsinghua.edu.cn/github-release/be5invis/Sarasa-Gothic/LatestRelease/)
- [XITS](https://ctan.org/pkg/xits)
- [Fira Sans](https://ctan.org/pkg/fira)
- [XITS Math](https://ctan.org/pkg/xits)
- [TeX Gyre Termes Math](https://ctan.org/pkg/tex-gyre-math-termes)
- [STIX Two Math](https://ctan.org/pkg/stix2-otf)

后五款字体是为胡话与算学准备的字体;
一般地, 您安装的乳胶里有它们.
前二款字体是土话字体;
一般地, 您需要动手安装它们.
这也不难.
我在[别处](https://wwi.lanzoup.com/b011lef9c)提供了字体包.
您可能需要 `bgtw` 这 4 个字母.
当然了, 假如您不相信我提供的字体包,
您也可以自行下载它们.

本书用的字体都是开放源代码的;
本书用的字体都是自由的.
我不必担心 "律师函".

当然, 您也可用别的字体.

您可自由地读本书;
您可自由地改本书;
您可自由地发布您的基于我的书的作品.

我欢迎任何评论;
我欢迎任何指正;
我欢迎任何建议.

---

纳纳米

2022 年 6 月 28 日
