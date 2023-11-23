**Como fazer para que as classes que representam esses 3 funcionários sejam obrigadas a implementar o método calculaSalario() ? Seria melhor usar classe abstrata ou interface?**

R: Classe abstrata, já que os 3 funcionários tem atributos em comum.

**Se quisermos obrigar que a classe que representa o Professor e a classe que representa o
Coordenador implementem o método: getValorBonus(), qual seria a melhor forma: classe
abstrata ou interface?**

R: Interface, já que não necessariamente as classes Coordenador e Professor vão ter os mesmos atributos.

**Considere também a classe ControleBonus, que terá como atributo um ou mais List para conter
todos os objetos que recebem bônus. Pergunta: é necessário ter 2 List ou apenas um?**

R: Já que Professor e Coordenador implementam uma interface em comum, é necessário ter apenas uma lista.

**O polimorfismo está presente nesse sistema?**

R: Sim, o polimorfismo se mostra presente nas diferentes implementações do método calculaSalario() e getBonus().
