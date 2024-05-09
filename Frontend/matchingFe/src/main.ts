import { createApp } from 'vue';

import App from './App.vue';
import {Button, NavBar,Icon,Tabbar, TabbarItem,Toast} from 'vant';
//import 'vant/lib/index.css';
import 'vant/es/toast/style';
import 'vant/lib/index.css'
const app = createApp(App);

app.use(Button);
app.use(NavBar);
app.use(Icon);
app.use(Tabbar);
app.use(TabbarItem);
app.use(Toast);
app.mount('#app');