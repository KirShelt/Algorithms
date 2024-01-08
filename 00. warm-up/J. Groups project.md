   <div class="header">
      <h1 class="title">J. Групповой проект</h1>
      <table>
         <tbody><tr class="time-limit">
            <td class="property-title">Ограничение времени</td>
            <td>1&nbsp;секунда</td>
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
         <p>Всего студентов по направлению «Мировая культура» — <span class="tex-math-text">n</span> человек. Преподаватель дал задание — групповой проект. Для выполнения этого задания студенты должны разбиться на группы численностью от <span class="tex-math-text">a</span> до <span class="tex-math-text">b</span> человек. Скажите, можно ли разбить всех студентов на группы для выполнения проекта или преподаватель что-то перепутал.
         </p></span></div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>В первой строке вводится число <span class="tex-math-text">t</span> (<span class="tex-math-text">1 ≤ t ≤ 100</span>) — количество тестовых случаев. Далее для каждого тестового случая вводится <span class="tex-math-text">3</span> целых числа <span class="tex-math-text">n</span>, <span class="tex-math-text">a</span> и <span class="tex-math-text">b</span> (<span class="tex-math-text">1 ≤ n ≤ 10<sup>9</sup></span>, <span class="tex-math-text">1 ≤ a ≤ b ≤ n</span>) — общее число студентов и ограничение на число студентов в одной группе.
         </p></span></div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Для каждого тестового случая выведите "YES", если можно разбить студентов на группы и "NO", если нельзя.</p></span></div>
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
            <td><pre>4
10 2 3
11 7 8
28 4 6
3 1 2
</pre></td>
            <td><pre>YES
NO
YES
YES
</pre></td>
         </tr>
      </tbody>
   </table>
