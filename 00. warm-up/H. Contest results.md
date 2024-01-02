   <div class="header">
      <h1 class="title">H. Результаты контеста</h1>
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
         <p>Чтобы оценить качество обучения программированию, в каждой группы студентов подсчитывается один параметр&nbsp;— суммарное количество решенных студентами задач.</p></span><p>Известно, что в первой группе суммарное количество решенных на контесте задач равно <span class="tex-math-text">a</span>, а во второй&nbsp;— <span class="tex-math-text">b</span>. Всего на контесте было предложено <span class="tex-math-text">n</span> задач, а также известно, что каждый студент решил не менее одной (и не более <span class="tex-math-text">n</span>) задач.
      </p>
      <p>По заданным <span class="tex-math-text">a</span>, <span class="tex-math-text">b</span> и <span class="tex-math-text">n</span> определите, могло ли в первой группе быть строго больше студентов, чем во второй.
      </p>
   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>Вводятся три целых числа <span class="tex-math-text">a</span>, <span class="tex-math-text">b</span>, <span class="tex-math-text">n</span> (<span class="tex-math-text">1 ≤ a, b, n ≤ 10000</span>).
         </p></span></div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Выведите "Yes" если в первой группе могло быть строго больше студентов, чем во второй, и "No" в противном случае.</p></span></div>
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
            <td><pre>60
30
4
</pre></td>
            <td><pre>Yes
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
            <td><pre>30
30
1
</pre></td>
            <td><pre>No
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
            <td><pre>30
150
4
</pre></td>
            <td><pre>No
</pre></td>
         </tr>
      </tbody>
   </table>