/*
 * This file is part of kassel, licensed under the MIT License.
 *
 * Copyright (c) 2018 KyoriPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kyori.kassel.permission;

public interface Permission {
  int CREATE_INSTANT_INVITE = 0x00000001;
  int KICK_MEMBERS = 0x00000002;
  int BAN_MEMBERS = 0x00000004;
  int ADMINISTRATOR = 0x00000008;
  int MANAGE_CHANNELS = 0x00000010;
  int MANAGE_GUILD = 0x00000020;
  int ADD_REACTIONS = 0x00000040;
  int VIEW_AUDIT_LOG = 0x00000080;
  int VIEW_CHANNEL = 0x00000400;
  int SEND_MESSAGES = 0x00000800;
  int SEND_TTS_MESSAGES = 0x00001000;
  int MANAGE_MESSAGES = 0x00002000;
  int EMBED_LINKS = 0x00004000;
  int ATTACH_FILES = 0x00008000;
  int READ_MESSAGE_HISTORY = 0x00010000;
  int MENTION_EVERYONE = 0x00020000;
  int USE_EXTERNAL_EMOJIS = 0x00040000;
  int CONNECT = 0x00100000;
  int SPEAK = 0x00200000;
  int MUTE_MEMBERS = 0x00400000;
  int DEAFEN_MEMBERS = 0x00800000;
  int MOVE_MEMBERS = 0x01000000;
  int USE_VAD = 0x02000000;
  int CHANGE_NICKNAME = 0x04000000;
  int MANAGE_NICKNAMES = 0x08000000;
  int MANAGE_ROLES = 0x10000000;
  int MANAGE_WEBHOOKS = 0x20000000;
  int MANAGE_EMOJIS = 0x40000000;
}
