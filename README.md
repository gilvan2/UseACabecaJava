# UseACabecaJava
Lições e execícios do livro Use a Cabeça Java

O objetivo desse repositório é práticar e melhorar habilidades com programação, terminal, editores de testo de terminal e linux.

Não será utilizadas nenhuma IDE, editor gráfico, mouse ou qualquer coisa para ganho do produtividade. A idéia desse projeto é codar e entender a fundo a linguagem é o ecossistema.

Estarei utilzando como sistema linux ubuntu 

Instalação do JDK

Instalaçao do Javac 

Instalação vim 
sudo apt install vim 

Compilar e executar  código em java: \n

Criar arquivo .java \n

rodar o comando javac arquivo.java \n

Será criado um arquivo.class \n

rodar comando java arquivo \n

Guia de Referencia do terminal

mkdir nome  - Criar diretório

cp local/arquivo local - Copiar arquivo e cola em outro  local

cp arquivo antigo arquivo novo - Criar cópia do arquivo antigo renomeado

mv local/arquivo local - Move o arquivo para outro local

mv nome arquivo antigo nome arquivo novo - Renomeia o arquivo

Para Diretórios...

mv diretorio antigo diretorio novo - Renomear o diretorio

cp diretorio antigo diretorio novo - Faz uma cópia do diretório ( Gera erro se tiver arquivos ou outras estruturas dentro do diretório )

cp -r diretorio antigo diretorio novo - Faz um cópia do diretorio com a recursividade ativada para o OS saber que precisar fazer a mesma ação com os arquivos e struturas que estavam dentro do diretório antigo

Guia de Referencia vim

i -> Entra no modo de inserção

esc -> Entra no modo de navegação ( os arquivos quando abertos de forma convencional entram em mode de navegação )

a -> Entra no modo de inserção 1 caracter afrente onde o cursor tinha ficado antes do fechamento do aquivo ou na saido do modo de inserção 

I -> Entra no modo de inserção no começo da linha

A -> Entra no modo de inserção no final da linha

o -> Entra no modo de inserção na próxima linha

O -> Entra no mode de inserção na linha acima

S -> Apaga a linha todo e entra no mode de inserção 

(: alguma coisa , subentende-se que o arquivo já esteja em modo de navegação )

:w -> Salvar o arquivo, sem fechá-lo	

:wq -> Salva e sair do arquivo

:q -> Sair do arquivo sem fazer nada, contanto que ele não tenha sido editado

:q! -> Sair do arquivo e perder o que foi editado

:x -> Salvar e sair do arquivo

Shift + zz -> Sair e salvar

yy com o cursor posicionado na linha -> Copiar toda a linha

p -> Cola o conteúdo copiado

yxy || xyy -> Copia x linhas 

dd -> Recortar a linha

xdd || -> Recortar x linhas

v -> Modo visual ( Serve por exemplo para selecionar um trecho do texto )

v ( Seleconado o trecho que deseja copiar ) y ( Para copiar o treco seleconado )

v + d Treho ( Remove o trecho pelo modo visual )

Crtl + v -> Selecionar em modo visual em coluna

xyw -> Copia x palavras

x | X | Shift x -> Apagar caracter ( um funciona como back space e ou outro funciona como delet

:w nome -> Trocar o nome do arquivo

:split novo arquivo -> Editar na mesma tela do vim 2 arquivos

Ctrl ww -> Navegar entre os 2 arquivos ( para sair do arquivo, usar os camandos de saida listados acima )

:r arquivo -> Tras todo o conteúdo do arquivo selecionado para dentro desse arquivo aberto

/palavra -> Procura a palavra dentro do arquivo aberto ( de cima pra baixo )

n -> Busca a próxima palavra da pesquisa feita em /palavra

??palavra -> Busca uma palavra no arquivo ( de baixo pra cima ) 

*******************************************************************************************
 COnjunto de comandos para buscar e substituir palavras no documento 
*******************************************************************************************

:linha/palavra Antiga/Palavra Nova -> Substituir na linha especifica  ( Substitui uma palavra por linha )

:linha inicio,linha final/Palavra Antiga Palavra Nova -> Substituir no intervalo  ( Substitui uma palavra por linha )

:%s/palavra Antiga/ Palavra Nova -> Substituir em todo o arquivo  ( Substitui uma palavra por linha )

:%s/palavra Antiga/Palavra Nova/g -> Substituir em todo o arquivo  ( Substitui todas as palavras encontradas na linha )

:e arquivo -> Abrir um novo arquivo ( Precisará salvar caso esse arquivo tenha sido editado )

**********************************************************************************************

:e! arquivo -> Forçar a abertura de um novo arquivo e desconsiderar se tem coisa salva no arquivo editado

:syntax on -> Reconhece sintaxe da linguagem de programaçao ( O arquivo precisa terminar com a extensão da linguagem )

:syntax off -> Desativa o reconecimento da sintaxe da linguagem de programação

:set number -> Habilitar a identificação dos números das linhas

:set nonu -> Desabilitar a identficação dos numeros das linhas
