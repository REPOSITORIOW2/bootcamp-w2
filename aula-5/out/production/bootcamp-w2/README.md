## Aula 5 - Exercício 2

Criaremos uma classe que nos permitirá criar dinamicamente instâncias de diferentes objetos. Uma fábrica genérica. Para isso, será necessário investigar algumas questões.

Usaremos as classes Properties, Class e mais algumas.


1. Criar uma interface chamada Sorter<T>, com o método abstrato public void sort(T arr[],Comparator<T> c).

2. Criar uma classe chamada QuickSortSorterImple que implemente a interface (em T) acima e sobrescreva o método sort (deixá-lo vazio por enquanto).

3. Buscar na internet alguma implementação do algoritmo de ordenação QuickSort (buscar pelas palavras: QuickSort.java) e utilizá-lo para programar o método sort da questão anterior, fazendo as modificações que sejam necessárias.

4. Idem aos exercícios 2 e 3, porém com o algoritmo de ordenação HeapSort, criando a classe HeapSortSorterImple

5. Idem aos exercícios 2 e 3, porém com o algoritmo de ordenação BubbleSort, criando a classe BubbleSortSorterImple.

6. Crie um arquivo de texto chamado MyFactory.properties na pasta do seu projeto. O conteúdo do arquivo deve ser: sorter=package.QuickSortSorterImple (sem aspas ou qualquer coisa diferente do que está destacado em amarelo).

7. Crie a classe MyFactory com o método public static Object getInstance (String objName).
Usando a classe Properties (investigue) leia o conteúdo da propriedade "sorter" do arquivo criado em (6), que neste caso será a string: "package.QuickSortSorterImple".

8. Usando a classe Class (investigar), crie dinamicamente um objeto do tipo obtido em (8) e o retorne.

9. Crie um programa, instancie um Sorter usando Factory, classifique um array de inteiros e outro de strings.

10. Modifique a implementação do objeto Sort em MyFactory.properties, para uma das outras implementações disponíveis (bubble ou heap).

11. Provar que tudo funciona corretamente.

12. Crie uma classe chamada Time, com dois métodos: start e stop, que respectivamente salvam a hora atual expressa em milissegundos em variáveis ​​de instância (investigue como fazer isso).

13. Adicione à classe Timer o método elapsedTime que retorna o tempo decorrido entre a hora de início (início) e a hora de término (parada).

14. Crie uma matriz de 5.000 valores inteiros, ordenados do maior para o menor. (Pesquise como ler e escrever o arquivo)

15. Ordene com o BubbleSort e verifique quanto tempo o processo demorou.

16. Altere a implementação (modificando em MyFactory.properties) para Heap ou Quick e verifique quanto tempo o processo leva com um algoritmo de melhor desempenho.

17. Em grupo: tirar conclusões.