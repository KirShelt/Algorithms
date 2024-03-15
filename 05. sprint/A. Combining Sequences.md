   <div class="header">
      <h1 class="title">A. Объединение последовательностей</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>3&nbsp;секунды</td>
         </tr>
         <tr class="memory-limit">
            <td class="property-title">Ограничение памяти</td>
            <td>512Mb</td>
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
         <p>Даны две бесконечных возрастающих последовательности чисел A и B. i-ый член последовательности A равен <span class="tex-math-text">i<sup>2</sup></span>. i-ый член последовательности B равен <span class="tex-math-text">i<sup>3</sup></span>. 
         </p></span><p>Требуется найти <span class="tex-math-text">C<sub>x</sub></span>, где C – возрастающая последовательность, полученная при объединении последовательностей A и B. Если существует некоторое
         число, которое встречается и в последовательности A и в последовательности B, то в последовательность C это число попадает
         в единственном экземпляре.
      </p>
   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>В единственной строке входного файла дано натуральное число x (1 ≤ x ≤ <span class="tex-math-text">10<sup>7</sup></span>). 
         </p></span><p></p>
   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>В выходной файл выведите <span class="tex-math-text">C<sub>x</sub></span>. 
         </p></span><p></p>
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
            <td><pre>1
</pre></td>
            <td><pre>1
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
            <td><pre>2
</pre></td>
            <td><pre>4
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
</pre></td>
            <td><pre>9
</pre></td>
         </tr>
      </tbody>
   </table>