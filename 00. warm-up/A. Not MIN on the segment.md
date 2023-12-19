   <div class="header">
      <h1 class="title">Не минимум на отрезке</h1>
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
         <p>Задана последовательность целых чисел <span class="tex-math-text">a<sub>1</sub>, a<sub>2</sub>, …, a<sub>n</sub></span>. Задаются запросы: сказать любой элемент последовательности на отрезке от <span class="tex-math-text">L</span> до <span class="tex-math-text">R</span> <span style="font-weight:bold;">включительно</span>, не равный минимуму на этом отрезке. 
         </p></span></div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>В первой строке содержатся два целых числа <span class="tex-math-text">N, 1 ≤ N ≤ 100</span> и <span class="tex-math-text">M, 1 ≤ M ≤ 1000</span>&nbsp;— длина последовательности и количество запросов соответственно.
         </p></span><p>Во второй строке&nbsp;— сама последовательность, <span class="tex-math-text">0 ≤ a<sub>i</sub> ≤ 1000</span>.
      </p>
      <p>Начиная с третьей строки перечисляются <span class="tex-math-text">M</span> запросов, состоящих из границ отрезка <span class="tex-math-text">L</span> и <span class="tex-math-text">R</span>, где <span class="tex-math-text">L, R</span> - индексы массива, нумеруются с нуля.
      </p>
   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>На каждый запрос выведите в отдельной строке ответ&nbsp;— любой элемент на <span class="tex-math-text">[L, R]</span>, кроме минимального. В случае, если такого элемента нет, выведите "NOT FOUND".
         </p></span></div>
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
            <td><pre>10 5
1 1 1 2 2 2 3 3 3 10
0 1
0 3
3 4
7 9
3 7
</pre></td>
            <td><pre>NOT FOUND
2
NOT FOUND
10
3
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
            <td><pre>4 2
1 1 1 2
0 2
0 3
</pre></td>
            <td><pre>NOT FOUND
2
</pre></td>
         </tr>
      </tbody>
   </table>