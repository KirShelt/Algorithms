   <div class="header">
      <h1 class="title">B. Дейкстра с восстановлением пути</h1>
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
         <p>Дан ориентированный взвешенный граф. Найдите кратчайший путь от одной заданной вершины до другой. </p></span></div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>В первой строке содержатся три числа: N, S и F (<span class="tex-math-text">1 ≤ N ≤ 100</span>, <span class="tex-math-text">1 ≤ S</span>, <span class="tex-math-text">F ≤ N</span>), где N&nbsp;— количество вершин графа, S&nbsp;— начальная вершина, а F&nbsp;— конечная. В следующих N строках вводится по N чисел, не превосходящих 100, – матрица смежности графа, где -1 означает, что
            ребра между вершинами нет, а любое неотрицательное число&nbsp;— наличие ребра данного веса. На главной диагонали матрицы записаны нули.
         </p></span><p></p>
   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Последовательно выведите все вершины одного (любого) из кратчайших путей, или -1, если пути между указанными вершинами не
            существует
         </p></span></div>
   <h2>Примечания</h2>
   <div class="notes"><span style="">
         <p><span style="font-weight:bold;">Пример ввода:</span></p></span><p>3 2 1</p>
      <p>0 1 1</p>
      <p>4 0 1</p>
      <p>2 1 0 </p>
      <p><span style="font-weight:bold;">Пример вывода:</span></p>
      <p>2 3 1</p>
      <p></p>
   </div>