   <div class="header">
      <h1 class="title">A. Равенство подстрок</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>15&nbsp;секунд</td>
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
         <p>Дана строка <span class="tex-math-text">S</span>, состоящая из строчных латинских букв.
         </p></span><p>Определите, совпадают ли строки одинаковой длины <span class="tex-math-text">L</span>, начинающиеся с позиций <span class="tex-math-text">A</span> и <span class="tex-math-text">B</span>.
      </p>
   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>В первой строке записана <span class="tex-math-text">S</span> (<span class="tex-math-text">1 ≤ |S| ≤ 2 ⋅ 10<sup>5</sup></span>), состоящая из строчных латинских букв.
         </p></span><p>Во второй строке записано число <span class="tex-math-text">Q</span> (<span class="tex-math-text">1 ≤ Q ≤ 2 ⋅ 10<sup>5</sup></span>)&nbsp;— количество запросов.
      </p>
      <p>В следющих <span class="tex-math-text">Q</span> строках записаны запросы: целые числа <span class="tex-math-text">L</span>, <span class="tex-math-text">A</span> и <span class="tex-math-text">B</span> (<span class="tex-math-text">1 ≤ L ≤ |S|</span>, <span class="tex-math-text">0 ≤ A, B ≤ (|S| - L)</span>)&nbsp;— длина подстрок и позиции, с которых они начинаются.
      </p>
   </div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Если строки совпадают&nbsp;— выведите "yes", иначе&nbsp;— "no".</p></span></div>
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
            <td><pre>acabaca
3
4 3 2
3 4 0
2 0 1
</pre></td>
            <td><pre>no
yes
no
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
            <td><pre>caeabaeadedcbdcdccec
10
13 4 3
2 12 15
10 1 3
3 8 15
13 5 6
7 2 6
9 8 8
19 0 0
19 0 0
6 7 13
</pre></td>
            <td><pre>no
no
no
no
no
no
yes
yes
yes
no
</pre></td>
         </tr>
      </tbody>
   </table>