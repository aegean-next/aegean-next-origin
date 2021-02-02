/*
 * Copyright (c) 2021. Aegean Next OpenSource FrameWork
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 *
 * ----- ----- ----- ----- -----
 *
 * Visit the project homepage for more information at https://next.aegean.tech,
 * Or see the code warehouse at https://github.com/aegean-next, https://gitee.com/aegean-next.
 */

package tech.aegean.next.origin.base.entity;

import lombok.Data;

import java.util.Map;

@Data
public class Result<T> {

    public static final String RESULT_CODE_SUCCESS = "200";

    public static final String RESULT_CODE_FAIL = "100";

    private Boolean isSuccess;

    public String code;

    private String message;

    public T data;

    public Map<String, Object> extData;

    // ----- ----- Constructor ----- -----

    public Result(Boolean isSuccess, String code, String message, T data, Map<String, Object> extData) {
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
        this.data = data;
        this.extData = extData;
    }

    // ----- ----- Function Success ----- -----

    public static <T> Result<T> ok(T data) {
        return new Result(true, RESULT_CODE_SUCCESS, "ok", data, null);
    }

    public static <T> Result<T> ok(Map<String, Object> extData) {
        return new Result(true, RESULT_CODE_SUCCESS, "ok", null, extData);
    }

    public static <T> Result<T> ok(String code, String message) {
        return new Result(true, code, message, null, null);
    }

    public static <T> Result<T> ok(T data, Map<String, Object> extData) {
        return new Result(true, RESULT_CODE_SUCCESS, "ok", data, extData);
    }

    public static <T> Result<T> ok(String code, String message, T data) {
        return new Result(true, code, message, data, null);
    }

    public static <T> Result<T> ok(String message, T data, Map<String, Object> extData) {
        return new Result(true, RESULT_CODE_SUCCESS, message, data, extData);
    }

    public static <T> Result<T> ok(String code, String message, T data, Map<String, Object> extData) {
        return new Result(true, code, message, data, extData);
    }

    // ----- ----- Function Fail ----- -----

    public static <T> Result<T> fail(T data) {
        return new Result(false, RESULT_CODE_FAIL, "error", data, null);
    }

    public static <T> Result<T> fail(Map<String, Object> extData) {
        return new Result(false, RESULT_CODE_FAIL, "error", null, extData);
    }

    public static <T> Result<T> fail(String code, String message) {
        return new Result(false, code, message, null, null);
    }

    public static <T> Result<T> fail(T data, Map<String, Object> extData) {
        return new Result(false, RESULT_CODE_FAIL, "error", data, extData);
    }

    public static <T> Result<T> fail(String code, String message, T data) {
        return new Result(false, code, message, data, null);
    }

    public static <T> Result<T> fail(String message, T data, Map<String, Object> extData) {
        return new Result(false, RESULT_CODE_FAIL, message, data, extData);
    }

    public static <T> Result<T> fail(String code, String message, T data, Map<String, Object> extData) {
        return new Result(false, code, message, data, extData);
    }

}
