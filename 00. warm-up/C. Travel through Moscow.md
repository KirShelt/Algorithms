   <div class="header">
      <h1 class="title">C. Путешествие по Москве</h1>
      <table>
         <tr class="time-limit">
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
      </table>
   </div>
   <div class="legend"><span style="">
         <p>Мэрия Москвы основательно подготовилась к празднованию тысячелетия города в 2147 году, построив под столицей бесконечную асфальтированную
            площадку, чтобы заменить все существующие в городе автомобильные дороги. В память о кольцевых и радиальных дорогах разрешили
            двигаться по площадке только двумя способами: 
            </p><ol>
               <li>В сторону точки начала координат или от неё. При этом из точки начала координат разрешено двигаться в любом направлении. </li>
               <li>Вдоль окружности с центром в начале координат и радиусом, который равен текущему расстоянию до начала координат. Двигаться
                  вдоль такой окружности разрешается в любом направлении (по или против часовой стрелки). 
               </li>
            </ol>
         <p></p></span><p>Вам, как ведущему программисту ответственной инстанции поручено разработать модуль, который будет определять кратчайший путь
         из точки <span class="tex-math-text">A</span>, с координатами <span class="tex-math-text">(x<sub>A</sub>, y<sub>A</sub>)</span> в точку <span class="tex-math-text">B</span> с координатами <span class="tex-math-text">(x<sub>B</sub>, y<sub>B</sub>)</span>. Считайте, что менять направление движения можно произвольное количество раз, но оно должно всегда соответствовать одному
         из двух описанных выше вариантов.
      </p>
   </div>
   <h2>Формат ввода</h2>
   <div class="input-specification"><span style="">
         <p>В первой строке ввода заданы четыре целых числа <span class="tex-math-text">x<sub>A</sub></span>, <span class="tex-math-text">y<sub>A</sub></span>, <span class="tex-math-text">x<sub>B</sub></span> и <span class="tex-math-text">y<sub>B</sub></span>, по модулю не превосходящие <span class="tex-math-text">10<sup>6</sup></span>. 
         </p></span></div>
   <h2>Формат вывода</h2>
   <div class="output-specification"><span style="">
         <p>Выведите одно число&nbsp;— минимальное расстояние, которое придётся преодолеть по пути из точки <span class="tex-math-text">A</span> в точку <span class="tex-math-text">B</span>, если не нарушать правил дорожного движения. Ваш ответ будет принят, если его абсолютная или относительная погрешность не
            превосходит <span class="tex-math-text">10<sup>-6</sup></span>.
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
            <td><pre>0 5 4 3
</pre></td>
            <td><pre>4.636476090008
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
            <td><pre>0 5 4 -3
</pre></td>
            <td><pre>10.000000000000
</pre></td>
         </tr>
      </tbody>
   </table>