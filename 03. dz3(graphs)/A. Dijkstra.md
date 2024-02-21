   <div class="header">
      <h1 class="title">A. Дейкстра</h1>
      <table>
         <thead>
            <tr><th></th>
            <th>Все языки</th>
            <th>Python 3.6</th>
         </tr></thead>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>1&nbsp;секунда</td>
            <td>2&nbsp;секунды</td>
         </tr>
         <tr class="memory-limit">
            <td class="property-title">Ограничение памяти</td>
            <td>64Mb</td>
            <td>256Mb</td>
         </tr>
         <tr class="input-file">
            <td class="property-title">Ввод</td>
            <td colspan="2">стандартный ввод или input.txt</td>
         </tr>
         <tr class="output-file">
            <td class="property-title">Вывод</td>
            <td colspan="2">стандартный вывод или output.txt</td>
         </tr>
      </tbody></table>
   </div>
   <div class="legend"><span style="">
         <p>Дан ориентированный взвешенный граф. Найдите кратчайшее расстояние от одной заданной вершины до другой. </p></span><p></p>
   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>В первой строке содержатся три числа: N, S и F (1≤ N ≤ 100, 1 ≤ S, F ≤ N), где N&nbsp;— количество вершин графа, S&nbsp;— начальная вершина, а F&nbsp;— конечная. В следующих N строках вводится по N чисел, не превосходящих 100, – матрица смежности графа, где -1 означает что
            ребра между вершинами нет, а любое неотрицательное число&nbsp;— наличие ребра данного веса. На главной диагонали матрицы записаны нули.
         </p></span></div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Выведите искомое расстояние или -1, если пути между указанными вершинами не существует.</p></span><p></p>
   </div>
   <h2>Пример</h2>
   <table class="sample-tests">
      <thead>
         <tr>
            <th>Ввод</th>
            <th>Вывод</th>
         </tr>
      </thead>
      <tbody>
         <tr>
            <td><pre>3 2 1
0 1 1
4 0 1
2 1 0
</pre></td>
            <td><pre>3
</pre></td>
         </tr>
      </tbody>
   </table>