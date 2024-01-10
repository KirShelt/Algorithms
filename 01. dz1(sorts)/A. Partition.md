   <div class="header">
      <h1 class="title">A. Partition</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>2&nbsp;секунды</td>
         </tr>
         <tr class="memory-limit">
            <td class="property-title">Ограничение памяти</td>
            <td>256Mb</td>
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
         <p>Базовым алгоритмом для быстрой сортировки является алгоритм partition, который разбивает набор элементов на две части относительно
            заданного предиката.<br>По сути элементы массива просто меняются местами так, что левее некоторой точки в нем после этой операции лежат элементы,
            удовлетворяющие заданному предикату, а справа — не удовлетворяющие ему.<br> Например, при сортировке можно использовать предикат «меньше опорного», что при оптимальном выборе опорного элемента может разбить массив на две примерно равные части.
         </p></span><p>Напишите алгоритм partition в качестве первого шага для написания быстрой сортировки.</p>
      <p></p>
   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>В первой строке входного файла содержится число <span class="tex-math-text">N</span> — количество элементов массива (<span class="tex-math-text">0 ≤ N ≤ 10<sup>6</sup></span>).<br>Во второй строке содержатся <span class="tex-math-text">N</span> целых чисел <span class="tex-math-text">a<sub>i</sub></span>, разделенных пробелами (<span class="tex-math-text">-10<sup>9</sup> ≤ a<sub>i</sub> ≤ 10<sup>9</sup></span>).<br>В третьей строке содержится опорный элемент <span class="tex-math-text">x</span> (<span class="tex-math-text">-10<sup>9</sup> ≤ x ≤ 10<sup>9</sup></span>).<br>Заметьте, что <span class="tex-math-text">x</span> не обязательно встречается среди <span class="tex-math-text">a<sub>i</sub></span>.
         </p></span></div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Выведите результат работы вашего алгоритма при использовании предиката «меньше x»: в первой строке выведите число элементов массива, меньших x, а во второй — количество всех остальных.</p></span></div>
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
            <td><pre>5
1 9 4 2 3
3
</pre></td>
            <td><pre>2
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
            <td><pre>0

0
</pre></td>
            <td><pre>0
0
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
            <td><pre>1
0
0
</pre></td>
            <td><pre>0
1
</pre></td>
         </tr>
      </tbody>
   </table>
   <h2>Примечания</h2>
   <div class="notes"><span style="">
         <p>Чтобы решить советуем реализовать функцию, которая принимает на вход предикат и пару итераторов, задающих массив (или массив
            и два индекса в нём), а возвращает точку разбиения, то есть итератор (индекс) на конец части, которая содержащит элементы,
            удовлетворяющие заданному предикату.
         </p></span><p>В таком виде вам будет удобно использовать эту функцию для реализации сортировки. </p>
   </div>