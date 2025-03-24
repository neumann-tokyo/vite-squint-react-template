import react from "@vitejs/plugin-react";
import { defineConfig } from "vite";

export default defineConfig({
    root: "./public",
    plugins: [react()],
    build: {
        outDir: "../dist",
    },
});
