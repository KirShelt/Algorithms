   <div class="header">
      <h1 class="title">B. Быстрая сортировка</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>10&nbsp;секунд</td>
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
         <p>Реализуйте быструю сортировку, используя алгоритм из предыдущей задачи.</p></span><p>На каждом шаге выбирайте опорный элемент и выполняйте partition относительно него. Затем рекурсивно запуститесь от двух частей,
         на которые разбился исходный массив.
      </p>
   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>В первой строке входного файла содержится число <span class="tex-math-text">N</span> — количество элементов массива (<span class="tex-math-text">0 ≤ N ≤ 10<sup>6</sup></span>).<br> Во второй строке содержатся <span class="tex-math-text">N</span> целых чисел <span class="tex-math-text">a<sub>i</sub></span>, разделенных пробелами (<span class="tex-math-text">-10<sup>9</sup> ≤ a<sub>i</sub> ≤ 10<sup>9</sup></span>). 
         </p></span></div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Выведите результат сортировки, то есть <span class="tex-math-text">N</span> целых чисел, разделенных пробелами. 
         </p></span></div>
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
            <td><pre>5
1 5 2 4 3
</pre></td>
            <td><pre>1 2 3 4 5 
</pre></td>
         </tr>
      </tbody>
   </table>
   <h2>Примечания</h2>
   <div class="notes"><span style="">
         <p>Используйте функцию, реализованную в предыдущей задаче. </p></span></div>