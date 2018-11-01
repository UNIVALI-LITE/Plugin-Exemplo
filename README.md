# PluginExemplo
Um plugin básico que serve de exemplo de como criar plugins no Portugol Studio

## IDE de programação
Recomendamos o uso da IDE NetBeans: https://netbeans.org/downloads/
O projeto do plugin-exemplo já está configurado para ela, portanto ficará mais fácil de configurar.

## Programando
Ao abrir o projeto no NetBeans e abrir a árvore do projeto deve existir algo parecido com isso:

![image](https://cdn.discordapp.com/attachments/354074984857206794/507647964102000651/unknown.png)

As classe principal que definirá o plugin é a PluginExemplo.

![image](https://cdn.discordapp.com/attachments/354074984857206794/507649848820891648/unknown.png)

A função **Inicializar** será chamada assim que o plugin for carregado para o Portugol Studio, por isso deve-se instalar todas as ações neste momento. Cada ação irá gerar um novo botão dentro do botão de plugins na IDE. Exemplos de ação podem ser vistos no pacote "acoes" do plugin.

![image](https://cdn.discordapp.com/attachments/354074984857206794/507650924752273420/unknown.png)![image](https://cdn.discordapp.com/attachments/354074984857206794/507651133314039857/unknown.png)

A função que seu botão irá executar dentro da IDE deve ser chamada na função **actionPerformed**, o código escrito ali, será executado assim que o botão correspondente for clicado no Portugol.

Com isso, você pode adicionar qualquer nova função ao Portugol Studio. Importante lembrar que você tem acesso a todas as classes publicas do Portugol Studio, portanto caso sinta necessidade de alguma informação da IDE, você pode pegá-la chamando a classe correspondente da IDE.

## Testando no Portugol

Para testar seu novo Plugin no Portugol Studio primeiro é necessário alterar o json de configurações.

![image](https://cdn.discordapp.com/attachments/354074984857206794/507668584621670402/unknown.png)

Dentro dele altere os valores designados a nome/versao/classe/descricao/autores. Principalmente o **classe**, ele deve apontar para o caminho até a classe principal, a PluginExemplo neste caso (caso a sua tenha outro nome, coloque o correspondente).

Em seguida é necessário contruir o seu plugin. Para fazer isso no NetBeans, clique com o botão direito no seu projeto e vá em *Limpar e Construir*.

![image](https://cdn.discordapp.com/attachments/354074984857206794/507654098103959553/unknown.png)

Quando o Netbeans terminar o processo de construir vá até a pasta do projeto do plugin e entre na pasta *dist*. Nela você encontrará os seguintes arquivos:

![image](https://cdn.discordapp.com/attachments/354074984857206794/507654941213720597/unknown.png)

Você deve criar um zip contendo o arquivo *ExemploPlugin.jar* (qualquer que seja o nome do seu) e a pasta *lib*. Altere a extensão do zip para psa.

![image](https://cdn.discordapp.com/attachments/354074984857206794/507656702250844161/unknown.png)

No Portugol Studio vá em **Plugins -> Instalar Plugin**. Espere ele carregar e pedir para reinicializar. Reinicialize e assim que for no botão plugins poderá ver seu plugin instalado no Portugol Studio.

![image](https://cdn.discordapp.com/attachments/354074984857206794/507666978006368257/unknown.png)

Os botões que você criou poderão ser vistos em uma Aba de código fonte. Crie uma nova aba e você verá um novo botão ao final da barra de botões. Este botão ao clicar nele, mostrará todos os botões que você criou e assim que você clicar neles a ação correspondente será realizada.

![image](https://cdn.discordapp.com/attachments/354074984857206794/507667166712168509/unknown.png)

Assim você pode criar seu próprio plugin.

Caso queria mais exemplos, pode olhar o Plugin da Gogoboard lançado que é feito com Gradle: https://github.com/UNIVALI-LITE/Plugin-Portugol-GoGoBoard

Caso tenha dúvidas fale conosco pelo nosso servidor no discord (https://discord.gg/fRW7Vq2) ou faça uma issue neste projeto.

