# CalculadoraRMI
Na interface Calculadora contem 7 métodos das operações realizadas na aplicação
Os Servidores Server1 e Server 2 Instanciam os dois objetos
Na classe RMI estão contidas os métodos a serem resgatados pelo objeto
Na classe cliente há:
  Um scanner para leitura dos dados apenas com o unput do usuario
  É feita a conexão com as classes servidores
  Um laço while mantem a calculadora executando até ser digitado "0".
  A varialvel operador determina qual metodo será acessado, agindo como operador. "X" e "Y" como Operando.
  Há um switch onde por meio da variavel operador é determinado qual método é acessado.
  A exeção de divisao por zero é solucionada no switch de chamada do método, se x for igual a 0 ele retorna ao menu.
