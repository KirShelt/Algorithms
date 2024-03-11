   <div class="header">
      <h1 class="title">C. Максимальный разрез</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>1&nbsp;секунда</td>
         </tr>
         <tr class="memory-limit">
            <td class="property-title">Ограничение памяти</td>
            <td>64Mb</td>
         </tr>
         <tr class="input-file">
            <td class="property-title">Ввод</td>
            <td colspan="1">стандартный ввод или input.txt</td>
         </tr>
         <tr class="output-file">
            <td class="property-title">Вывод</td>
            <td colspan="1">стандартный вывод или output.txt</td>
         </tr>
      </tbody></table>
   </div>
   <div class="legend"><span style="">
         <p>Взвешенный неориентированный граф без петель задан матрицей смежности. Распределите вершины по двум долям так, чтобы сумма
            весов рёбер, соединяющих вершины из разных долей, была максимальна.
         </p></span></div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>Вводится число <span class="tex-math-text">N</span> (<span class="tex-math-text">2 ≤ N ≤ 20</span>)&nbsp;— количество вершин в графе. 
         </p></span><p>В следующих <span class="tex-math-text">N</span> строках, содержащих по <span class="tex-math-text">N</span> целых чисел от 0 до 1000, задаётся матрица смежности. 0 означает отсутствие ребра.
      </p>
   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>В первой строке выведите суммарный вес рёбер, соединяющих вершины из разных долей. </p></span><p>Во второй строке выведите <span class="tex-math-text">N</span> чисел 1 или 2&nbsp;— номера долей для каждой из вершин графа.
      </p>
   </div>
   <h3>Пример 1</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод</th>
            <th>Вывод</th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>2
0 1
1 0
</pre></td>
            <td><pre>1
2 1 
</pre></td>
         </tr>
      </tbody>
   </table>
   <h3>Пример 2</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод</th>
            <th>Вывод</th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>3
0 1 2
1 0 2
2 2 0
</pre></td>
            <td><pre>4
2 2 1 
</pre></td>
         </tr>
      </tbody>
   </table>
   <h3>Пример 3</h3>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод</th>
            <th>Вывод</th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>4
0 10 3 0
10 0 7 2
3 7 0 9
0 2 9 0
</pre></td>
            <td><pre>26
2 1 2 1 
</pre></td>
         </tr>
      </tbody>
   </table>