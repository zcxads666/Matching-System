import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

//import styleImport,{VantResolve} from 'vite-plugin-style-import';
import { createStyleImportPlugin, VantResolve } from 'vite-plugin-style-import'
// https://vitejs.dev/config/
export default defineConfig({
  plugins: [
    vue(),
    createStyleImportPlugin({
      resolves: [
        VantResolve()
      ],
      libs: [
        {
          libraryName: "vant",
          esModule: true,
          resolveStyle: (name) => {
           // `/Volumes/扩展/project/Matching-System/Frontend/node_modules/vant/es/${name}/style`

            if (name == 'show-toast') {
              return `../es/toast/style/index`; //修改vant show-toast引入路径
            } else {
              return `../es/${name}/style/index`; //修改vant引入路径

            }
          } // 注意这里的路径适用于vite-plugin-style-import 2.0版本
        },
      ]
    })
  ]
})