/// <reference types="vitest" />
import { defineConfig } from "vite";
import react from "@vitejs/plugin-react";

export default defineConfig({
    test: {
        include: ["public/**/**test.mjs", "public/**/**test.jsx"],
    },
    plugins: [react()],
});
