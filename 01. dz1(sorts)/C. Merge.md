   <div class="header">
      <h1 class="title">C. Слияние</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>5&nbsp;секунд</td>
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
         <p>Базовый алгоритм для сортировки слиянием&nbsp;— алгоритм слияния двух упорядоченных массивов в один упорядоченный массив. Эта операция выполняется за линейное время с линейным
            потреблением памяти. Реализуйте слияние двух массивов в качестве первого шага для написания сортировки слиянием. 
         </p></span></div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>В первой строке входного файла содержится число <span class="tex-math-text">N</span> — количество элементов первого массива (<span class="tex-math-text">0 ≤ N ≤ 10<sup>6</sup></span>).<br> Во второй строке содержатся <span class="tex-math-text">N</span> целых чисел <span class="tex-math-text">a<sub>i</sub></span>, разделенных пробелами, отсортированные по неубыванию (<span class="tex-math-text">-10<sup>9</sup> ≤ a<sub>i</sub> ≤ 10<sup>9</sup></span>).<br> В третьей строке входного файла содержится число <span class="tex-math-text">M</span> — количество элементов второго массива (<span class="tex-math-text">0 ≤ M ≤ 10<sup>6</sup></span>).<br> В третьей строке содежатся <span class="tex-math-text">M</span> целых чисел <span class="tex-math-text">b<sub>i</sub></span>, разделенных пробелами, отсортированные по неубыванию (<span class="tex-math-text">-10<sup>9</sup> ≤ b<sub>i</sub> ≤ 10<sup>9</sup></span>). 
         </p></span></div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Выведите результат слияния этих двух массивов, то есть <span class="tex-math-text">M + N</span> целых чисел, разделенных пробелами, в порядке неубывания. 
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
            <td><pre>5
1 3 5 5 9
3
2 5 6
</pre></td>
            <td><pre>1 2 3 5 5 5 6 9 
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
            <td><pre>1
0
0

</pre></td>
            <td><pre>0 
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
            <td><pre>0

1
0
</pre></td>
            <td><pre>0 
</pre></td>
         </tr>
      </tbody>
   </table>
   <h2>Примечания</h2>
   <div class="notes"><span style="">
         <p>Для решения этой задачи советуем реализовать функцию, которая принимает на вход две пары итераторов, задающие два массива,
            и итератор на начало буфера, в который необходимо записывать результат. Итераторы можжно заменить на передачу массивов и индексов
            в них. В таком виде вам будет удобно использовать эту функцию для реализации сортировки. 
         </p></span></div>