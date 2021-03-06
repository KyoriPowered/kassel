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
package net.kyori.kassel.guild.member;

import java.util.stream.Stream;
import net.kyori.kassel.guild.Guild;
import net.kyori.kassel.guild.role.Role;
import net.kyori.kassel.user.User;
import net.kyori.mu.Maybe;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * A guild member.
 */
public interface Member {
  /**
   * Gets the guild.
   *
   * @return the guild
   */
  @NonNull Guild guild();

  /**
   * Gets the user.
   *
   * @return the user
   */
  @NonNull User user();

  /**
   * Gets the nick.
   *
   * @return the nick
   */
  @NonNull Maybe<String> nick();

  /**
   * Gets roles.
   *
   * @return the roles
   */
  @NonNull Roles roles();

  /**
   * A guild member's roles.
   */
  interface Roles {
    /**
     * Gets the roles this member has.
     *
     * @return the roles this member has
     */
    @NonNull Stream<Role> all();

    /**
     * Adds a role.
     *
     * @param role the role
     */
    void add(final @NonNull Role role);

    /**
     * Removes a role.
     *
     * @param role the role
     */
    void remove(final @NonNull Role role);
  }
}
