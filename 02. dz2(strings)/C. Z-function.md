   <div class="header">
      <h1 class="title">C. Z-функция</h1>
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
         <p>Дана непустая строка <span class="tex-math-text">S</span>, длина которой <span class="tex-math-text">N</span> не превышает <span class="tex-math-text">10<sup>6</sup></span>. Будем считать, что элементы строки нумеруются от 0 до <span class="tex-math-text">N-1</span>.
         </p></span><p>Вычислите z-функцию <span class="tex-math-text">z[i]</span> для всех <span class="tex-math-text">i</span> от 0 до <span class="tex-math-text">N-1</span>. <span class="tex-math-text">z[i]</span> определяется как максимальная длина подстроки, начинающейся с позиции i и совпадающей с префиксом всей строки. <span class="tex-math-text">z[0] = 0</span></p>
   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>Одна строка длины <span class="tex-math-text">N</span>, <span class="tex-math-text">0 &lt; N ≤ 10<sup>6</sup></span>, состоящая из прописных латинских букв.
         </p></span></div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Выведите <span class="tex-math-text">N</span> чисел — значения z-функции для каждой позиции, разделённые пробелом.
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
            <td><pre>abracadabra
</pre></td>
            <td><pre>0 0 0 1 0 1 0 4 0 0 1 
</pre></td>
         </tr>
      </tbody>
   </table>
